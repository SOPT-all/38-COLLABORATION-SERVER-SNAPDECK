-- =========================================================
-- Seed data for sample_slides, decks, slides, chats
-- MySQL
-- =========================================================

SET NAMES utf8mb4;

SET FOREIGN_KEY_CHECKS = 0;

DELETE FROM chats;
DELETE FROM slides;
DELETE FROM decks;
DELETE FROM sample_slides;

SET FOREIGN_KEY_CHECKS = 1;

-- ----- sample_slides -----
INSERT INTO `sample_slides` (`id`, `image_name`, `title`, `slide_count`, `created_at`, `updated_at`) VALUES (1, 'img_explore1', 'Claude cop', 1, '2026-05-06 09:00:00', '2026-05-06 09:00:00');
INSERT INTO `sample_slides` (`id`, `image_name`, `title`, `slide_count`, `created_at`, `updated_at`) VALUES (2, 'img_explore2', 'Claude Copilot vs GPT in Agent Market', 1, '2026-05-06 10:00:00', '2026-05-06 10:00:00');
INSERT INTO `sample_slides` (`id`, `image_name`, `title`, `slide_count`, `created_at`, `updated_at`) VALUES (3, 'img_explore3', 'Zero-Click Era Survival Guide', 1, '2026-05-06 11:00:00', '2026-05-06 11:00:00');

-- ----- decks -----
INSERT INTO `decks` (`id`, `visible_count`, `created_at`, `updated_at`) VALUES (1, 5, '2026-05-07 10:00:00', '2026-05-07 10:14:00');
INSERT INTO `decks` (`id`, `visible_count`, `created_at`, `updated_at`) VALUES (2, 5, '2026-05-07 11:00:00', '2026-05-07 11:18:00');
INSERT INTO `decks` (`id`, `visible_count`, `created_at`, `updated_at`) VALUES (3, 5, '2026-05-07 14:00:00', '2026-05-07 14:16:00');

-- ----- slides -----
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (1, 1, 1, 'img_apple_1', 'Apple의 생태계 전략과 모바일 기술 분야의 경쟁 우위', '', '[발표자명] | [회사명] | [직책] | [YYYY-MM-DD]', '2026-05-07 10:00:30', '2026-05-07 10:14:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (2, 1, 2, 'img_apple_2', '하드웨어와 소프트웨어의 수직적 통합을 통한 사용자 경험 최적화', 'Apple은 자체 설계한 A-시리즈 및 M-시리즈 칩을 통해 하드웨어 성능을 극대화합니다.
독자적인 iOS와 macOS 운영체제는 하드웨어와 완벽하게 맞춤화된 사용자 경험을 제공합니다.
이러한 수직적 통합은 타사 대비 월등한 전력 효율성과 연산 속도를 만듭니다.
사용자는 기기 간의 이질감 없는 인터페이스를 통해 높은 만족도를 유지합니다.
독점적 하드웨어-소프트웨어 구조는 강력한 진입 장벽을 구축하는 핵심 요소입니다.
정기적인 보안 업데이트와 최적화는 기기의 잔존 가치를 높여 브랜드 충성도를 강화합니다.', '[다이어그램] Apple 하드웨어, 소프트웨어, 서비스의 결합 구조도', '2026-05-07 10:00:30', '2026-05-07 10:14:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (3, 1, 3, 'img_apple_3', '강력한 ''가두리 양식장(Walled Garden)'' 효과와 기기 간 연결성', 'iCloud를 중심으로 모든 기기의 데이터가 실시간으로 동기화되어 사용자 편의성을 극대화합니다.
에어드롭(AirDrop), 핸드오프(Handoff) 등 기기 간 연속성 기능은 Apple 기기 추가 구매를 유도합니다.
타사 제품으로의 전환을 어렵게 만드는 높은 전환 비용(Switching Cost)을 창출합니다.
App Store를 통한 엄격한 앱 생태계 관리는 고품질의 서비스 품질과 보안을 유지합니다.
Apple Watch, AirPods 등 웨어러블 기기의 결합은 생태계의 결속력을 더욱 강화합니다.
서비스 부문의 매출 비중 증가는 하드웨어 교체 주기 연장에도 수익성을 보존하는 전략입니다.', '[차트] 기기 보유 수 증가에 따른 고객 이탈률 감소 상관관계 그래프', '2026-05-07 10:00:30', '2026-05-07 10:14:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (4, 1, 4, 'img_apple_4', '독자 칩셋 기술력을 바탕으로 한 기술적 경쟁 우위 및 미래 전략', 'Apple Silicon으로의 전환을 통해 노트북과 모바일 간의 기술적 경계를 허물어가고 있습니다.
머신러닝 전용 뉴럴 엔진(Neural Engine) 탑재로 온디바이스 AI 분야에서 우위를 점하고 있습니다.
타사 플래그십 모델 대비 긱벤치(Geekbench) 등 성능 지표에서 압도적인 수치를 기록합니다.
독자적인 GPU 아키텍처는 고사양 게임 및 전문가용 영상 편집 환경을 모바일화했습니다.
공급망 관리(SCM) 최적화를 통해 핵심 부품의 안정적 수급과 원가 경쟁력을 확보했습니다.
지속적인 특허 확보를 통해 증강현실(AR)과 혼합현실(MR) 시장의 기술적 기반을 선점 중입니다.', '[테이블] Apple A-시리즈 칩과 경쟁사 프로세서 간의 성능 및 전력 효율 비교표', '2026-05-07 10:00:30', '2026-05-07 10:14:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (5, 1, 5, 'img_apple_5', '지속 가능한 성장 모델: 서비스 플랫폼으로의 성공적 전환', '하드웨어 판매 중심에서 구독 서비스 기반의 ''플랫폼 비즈니스''로의 전환을 가속화해야 합니다.
강력한 충성 고객층을 활용하여 신규 카테고리(공간 컴퓨팅 등)로의 확장을 도모합니다.
개인정보 보호와 보안을 최우선 가치로 내세워 브랜드 신뢰도를 지속적으로 제고합니다.
에코시스템의 폐쇄성에 대한 반독점 규제 리스크를 유연하게 관리해야 합니다.
AI 기술의 내재화를 통해 지능형 사용자 비서 기능을 고도화하여 사용자 경험을 재정의합니다.
핵심 요약: 통합 생태계는 단순한 편리함을 넘어 강력한 비즈니스 경쟁 우위의 원천입니다.', '[플로우차트] 현재 모바일 시장 지배력에서 미래 공간 컴퓨팅으로 이어지는 성장 로드맵', '2026-05-07 10:00:30', '2026-05-07 10:14:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (6, 1, 6, 'img_apple_6', '미래 전략: Apple Intelligence와 생성형 AI의 결합', 'Apple Intelligence를 통한 개인화된 AI 경험의 생태계 내 통합
온디바이스 처리와 비공개 클라우드 컴퓨팅(PCC)을 결합한 하이브리드 보안 모델
Siri의 지능형 비서 기능 고도화 및 앱 간 동작 실행 역량 강화
텍스트, 이미지 생성 및 언어 이해를 돕는 시스템 전반의 쓰기 도구 제공
OpenAI 등 외부 AI 모델과의 협업을 통한 사용자 선택권 및 확장성 확보
하드웨어 업그레이드 수요 자극을 통한 기기 교체 주기 가속화 전략', '[다이어그램] Apple Intelligence의 데이터 처리 구조 (온디바이스 vs 비공개 클라우드) 다이어그램', '2026-05-07 10:00:30', '2026-05-07 10:14:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (7, 2, 1, 'img_yc_1', 'Y Combinator와 A16Z의 투자 전략 및 포트폴리오 성과 비교', '', '[발표자명] | [회사명] | [직책] | [YYYY-MM-DD]', '2026-05-07 11:00:30', '2026-05-07 11:18:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (8, 2, 2, 'img_yc_2', '극초기 액셀러레이팅 vs 대형 벤처 캐피털의 전략적 차이', 'YC는 ''Batch'' 시스템을 통해 극초기 스타트업에 소액을 대량으로 투자합니다.
A16Z는 성숙 단계의 기업에 대규모 자본을 투입하여 리드 투자자 역할을 수행합니다.
YC는 창업가 교육과 커뮤니티 형성에 집중하여 강력한 알럼나이 네트워크를 구축했습니다.
A16Z는 ''Full-stack'' 지원 모델로 마케팅, 인사, 법률 등 전문 컨설팅을 제공합니다.
투자 기관 모두 두 기술 중심의 혁신 기업을 발굴하는 데 핵심 역할을 집중하고 있습니다.
투자 규모 면에서 YC는 표준 계약을 선호하며, A16Z는 시장 상황에 따른 유연한 베팅을 추구합니다.', '[다이어그램] YC의 양적 팽창 모델과 A16Z의 질적 지원 모델 비교 구조도', '2026-05-07 11:00:30', '2026-05-07 11:18:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (9, 2, 3, 'img_yc_3', '시드 투자의 표준 YC vs 플랫폼 VC의 선구자 A16Z', 'YC는 에어비앤비, 드롭박스 등 유니콘 제조기로서의 확고한 브랜드를 보유하고 있습니다.
A16Z는 페이스북, 코인베이스 등 파괴적 혁신을 주도하는 기업에 선제적으로 투자합니다.
YC의 투자 결정은 데이터와 창업자의 잠재력에 기반한 빠른 의사결정이 특징입니다.
A16Z는 소프트웨어가 세상을 먹어치운다는 철학 아래 기술 인프라에 집중 투자합니다.
양사 모두 웹3, AI 등 차세대 기술 트렌드를 주도하여 시장의 방향성을 제시합니다.
포트폴리오 다양성 측면에서 YC는 광범위한 산업군을, A16Z는 고성장 섹터를 선호합니다.', '[테이블] 투자 단계, 평균 투자금액, 주요 지원 서비스 항목별 비교표', '2026-05-07 11:00:30', '2026-05-07 11:18:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (10, 2, 4, 'img_yc_4', '엑시트 성과 및 유니콘 배출을 통한 시장 지배력 확인', 'YC는 현재까지 4,000개 이상의 스타트업을 육성하여 압도적인 포트폴리오 수를 자랑합니다.
A16Z는 운용 자산(AUM) 규모 면에서 세계 최고 수준의 자본 동원력을 보유하고 있습니다.
YC 출신 기업들의 총 시가총액은 6,000억 달러를 상회하여 생태계 영향력을 증명했습니다.
A16Z는 상장(IPO) 및 M&A 단계에서 높은 회수율을 기록하여 투자자 수익을 극대화합니다.
최근 AI 붐 속에서 두 기관 모두 오픈AI, 앤스로픽 등 핵심 기업에 대한 영향력을 확대 중입니다.
시장 변동성에도 불구하고 양사의 포트폴리오는 견고한 성장세를 유지하고 있습니다.', '[차트] 연도별 유니콘 기업 배출 수 및 포트폴리오 가치 성장 추이 그래프', '2026-05-07 11:00:30', '2026-05-07 11:18:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (11, 2, 5, 'img_yc_5', '미래 투자 환경의 주도권 확보를 위한 핵심 전략 제언', '초기 발굴 역량과 사후 관리 시스템의 결합이 향후 VC 경쟁력의 핵심이 될 것입니다.
창업자 친화적인 투자 조건과 강력한 네트워크 인프라의 구축이 필수적입니다.
기술 트렌드 변화에 선제적으로 대응하기 위한 리서치 역량 강화가 요구됩니다.
[전략 제안]: 초기 단계의 다양성 확보와 성장 단계의 집중 지원 모델을 병치해야 합니다.
결론적으로 두 모델의 장점을 흡수한 하이브리드 형태의 투자 전략이 유망할 것으로 보입니다.
상세 문의 및 추가 자료 요청: [email@example.com]', '[타임라인] 실리콘밸리 투자 패러다임의 변화와 향후 전망 로드맵', '2026-05-07 11:00:30', '2026-05-07 11:18:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (12, 2, 6, 'img_yc_6', '글로벌 시장 확장을 위한 파트너십 및 투자 연합 전략', 'YC는 글로벌 네트워크를 활용하여 신흥 시장 창업자들의 실리콘밸리 진출을 지원합니다.
A16Z는 글로벌 규제 환경 대응을 위해 각국 정부 및 기관과의 정책 파트너십을 강화합니다.
양사는 전 세계 유망 VC들과의 공동 투자(Co-investment)를 통해 리스크를 분산합니다.
지역별 거점 운영을 통해 현지 시장 특성에 최적화된 맞춤형 액셀러레이팅을 제공합니다.
국경을 넘는 인재 채용 네트워크를 구축하여 포트폴리오사의 글로벌 채용을 돕습니다.
다국적 기업(CVC)과의 전략적 제휴를 통해 스타트업의 글로벌 판로 개척을 지원합니다.
데이터 기반의 글로벌 마켓 인텔리전스를 공유하여 투자 결정의 정확도를 높입니다.', '[다이어그램] YC와 A16Z의 글로벌 확장 및 파트너십 네트워크 구조도', '2026-05-07 11:00:30', '2026-05-07 11:18:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (13, 3, 1, 'img_openai_1', 'OpenAI ChatGPT가 엔터프라이즈 소프트웨어 및 생산성 도구에 미치는 영향', '', '[발표자명] | [회사명 / 소속 부서] | [YYYY-MM-DD]', '2026-05-07 14:00:30', '2026-05-07 14:16:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (14, 3, 2, 'img_openai_2', 'AI 통합을 통한 엔터프라이즈 소프트웨어의 패러다임 변화', '생성형 AI는 단순한 도구를 넘어 기업 운영의 핵심 인터페이스로 진화하고 있습니다.
기존의 복잡한 UI/UX 대신 자연어 기반의 인터페이스가 표준으로 자리 잡고 있습니다.
데이터 분석과 보고서 작성이 자동화되어 의사결정 속도가 획기적으로 향상됩니다.
기업용 소프트웨어 시장에서 AI 기능 포함 여부가 주요 경쟁 우위 요소가 되었습니다.
클라우드 기반 서비스와 결합하여 확장성이 높은 엔터프라이즈 솔루션이 구축되고 있습니다.
비즈니스 로직의 자동화로 인해 운영 효율성이 이전 대비 30% 이상 개선될 전망입니다.', '[다이어그램] 기존 수동 워크플로우와 AI 통합 자동화 워크플로우의 비교 구조도', '2026-05-07 14:00:30', '2026-05-07 14:16:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (15, 3, 3, 'img_openai_3', '업무 도구의 지능화가 가져오는 개인 및 팀 생산성의 혁신', 'Microsoft 365 Copilot 등 문서 작성 및 이메일 관리의 자동화가 가속화됩니다.
회의 요약, 일정 관리, 할 일 목록 생성 등 반복적인 관리 업무가 제거됩니다.
다국어 지원 및 실시간 번역을 통해 글로벌 협업의 장벽이 낮아집니다.
코드 생성 및 디버깅 지원으로 개발 생산성이 최대 2배 이상 증가하고 있습니다.
초안 작성 시간을 단축하여 창의적이고 전략적인 과업에 더 집중할 수 있습니다.
팀 내 지식 공유가 AI 검색을 통해 더욱 빠르고 정확하게 이루어집니다.', '[차트] AI 도구 도입 전후 업무 시간 분배 및 생산성 향상률 지표', '2026-05-07 14:00:30', '2026-05-07 14:16:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (16, 3, 4, 'img_openai_4', '엔터프라이즈 도입 시 고려해야 할 보안 및 데이터 거버넌스', '기업의 민감한 내부 데이터 유출 방지를 위한 전용 인스턴스 구축이 필수적입니다.
데이터 프라이버시 준수를 위해 학습 데이터 제외 옵션과 암호화가 적용됩니다.
AI가 생성한 결과물의 신뢰성과 할루시네이션(환각 현상)에 대한 검증 프로세스가 필요합니다.
역할 기반 접근 제어(RBAC)를 통해 정보 접근 권한을 엄격히 관리해야 합니다.
윤리적 AI 사용 가이드라인 수립을 통해 법적 리스크를 사전에 방지합니다.
지속적인 모니터링을 통해 AI 모델의 편향성과 정확성을 정기적으로 점검합니다.', '[테이블] 일반 소비자용 ChatGPT와 엔터프라이즈용 서비스의 보안 기능 비교표', '2026-05-07 14:00:30', '2026-05-07 14:16:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (17, 3, 5, 'img_openai_5', '결론: AI 중심의 비즈니스 미래와 실행 전략', 'ChatGPT는 단순한 유행이 아닌 엔터프라이즈의 근본적인 운영 체제 변화를 의미합니다.
성공적인 도입을 위해 작은 프로젝트부터 시작하여 점진적으로 확대하는 전략이 필요합니다.
전사적인 AI 리터러시 교육을 통해 임직원의 도구 활용 능력을 배양해야 합니다.
보안이 담보된 엔터프라이즈 환경 구축을 최우선 과제로 설정하십시오.
변화하는 기술 환경에 맞춘 유연한 거버넌스 체계를 수립하십시오.
지금 바로 AI 전략을 수립하여 시장 내 경쟁 우위를 선점하시기 바랍니다.', '[타임라인] 엔터프라이즈 AI 도입 로드맵: 도입 검토, 보안 구축, 전사 확산 단계', '2026-05-07 14:00:30', '2026-05-07 14:16:00');
INSERT INTO `slides` (`id`, `deck_id`, `order`, `image_name`, `title`, `content`, `footer`, `created_at`, `updated_at`) VALUES (18, 3, 6, 'img_openai_6', '섹션 6: 향후 전망 및 기술적 진화 방향', '멀티모달(Multimodal) AI의 결합으로 텍스트를 넘어 이미지, 음성, 영상 기반의 업무 처리가 가능해집니다.
자율적인 AI 에이전트가 복합적인 비즈니스 프로세스를 스스로 수행하는 단계로 진화합니다.
특정 산업군에 특화된 수직적(Vertical) AI 솔루션이 시장의 주류로 부상할 전망입니다.
온디바이스 AI(On-device AI) 기술과 결합하여 보안성과 반응 속도가 더욱 강화됩니다.
인간과 AI의 협업 모델이 고도화되어 ''AI와 함께 일하는 문화''가 정착될 것입니다.
실시간 데이터 스트리밍과 결합하여 예측 기반의 선제적 의사결정 지원 시스템이 구축됩니다.', '[플로우차트] AI 기술 진화 단계: 단순 챗봇 → 개인 비서 → 자율 에이전트 → 비즈니스 파트너', '2026-05-07 14:00:30', '2026-05-07 14:16:00');

-- ----- chats -----
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (1, 1, 'USER', 1, 'Apple의 생태계 전략과 모바일 기술 분야의 경쟁 우위에 대한 보고서를 디자인해줘', '2026-05-07 10:00:00');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (2, 1, 'AI', 2, '생태계 전략과 모바일 기술 경쟁 우위 보고서입니다. 기술 전략 보고서의 전략 보고서 presentation. total 5 slides.', '2026-05-07 10:00:30');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (3, 1, 'USER', 3, '섹션 6에 대한 콘텐츠를 생성해줘', '2026-05-07 10:13:00');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (4, 1, 'AI', 4, 'Apple의 생태계 전략 보고서에 6번째 섹션을 추가하고 상세 콘텐츠를 생성하겠습니다. 6번 슬라이드에는 향후 전망 및 결론을 담아 마무리하면 좋을 것 같네요. 바로 진행할까요?', '2026-05-07 10:13:30');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (5, 2, 'USER', 1, 'Y Combinator와 A16Z의 투자 전략 및 포트폴리오 성과를 비교하는 보고서를 작성해줘', '2026-05-07 11:00:00');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (6, 2, 'AI', 2, 'Generated structure for ''YC vs A16Z: 실리콘밸리 거물들의 투자 전략 및 성과 비교 보고서'' presentation. Total 5 slides.', '2026-05-07 11:00:30');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (7, 2, 'USER', 3, '섹션 6에 대한 콘텐츠를 생성해줘', '2026-05-07 11:17:00');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (8, 2, 'AI', 4, '현재 구성된 5개 슬라이드에 이어, ''섹션 6: 결론 및 시사점''을 추가하고 상세 콘텐츠를 생성하겠습니다.

추가될 슬라이드 내용:
1. 투자 생태계에서의 상호보완성: 초기 발굴(YC)과 스케일업(A16Z)의 역할 분담
2. 미래 투자 트렌드: AI 및 딥테크 분야에 대한 양사의 접근 방식 변화
3. 스타트업을 위한 시사점: 단계별 적합한 파트너 선정 전략

슬라이드를 추가하여 전체 구성을 업데이트할까요?', '2026-05-07 11:17:30');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (9, 3, 'USER', 1, 'OpenAI의 ChatGPT가 엔터프라이즈 소프트웨어 및 생산성 도구에 미치는 영향에 대한 프레젠테이션을 제작해줘', '2026-05-07 14:00:00');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (10, 3, 'AI', 2, 'Generated structure for ''OpenAI ChatGPT가 엔터프라이즈 소프트웨어 및 생산성 도구에 미치는 영향'' presentation. Total 5 slides.', '2026-05-07 14:00:30');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (11, 3, 'USER', 3, '섹션 6에 대한 콘텐츠를 생성해줘', '2026-05-07 14:15:00');
INSERT INTO `chats` (`id`, `deck_id`, `role`, `order`, `message`, `created_at`) VALUES (12, 3, 'AI', 4, '섹션 6에 대한 상세 콘텐츠를 추가하겠습니다. 엔터프라이즈 환경에서의 향후 전망과 요약 내용을 중심으로 구성에 드릴게요.', '2026-05-07 14:15:30');
