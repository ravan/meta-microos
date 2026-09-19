SUMMARY = "Translations for Thonny IDE"
DESCRIPTION = "Provides translations for Thonny IDE"
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "thonny-lang-5.0.0-1.2.noarch.rpm"
RPM_HASH = "ce3035e4ce0d80ee0d96aff807e9482a451ee06e00dde116c216358a3b6689f3df81739f5d289f3ac2435665f6793a9000bd635f97ce20e308c332589cc92c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-thonny-ar-SA \
locale-thonny-be-BY \
locale-thonny-bg-BG \
locale-thonny-ca-ES \
locale-thonny-cs-CZ \
locale-thonny-de-DE \
locale-thonny-el-GR \
locale-thonny-en-GB \
locale-thonny-en-US \
locale-thonny-es-ES \
locale-thonny-et-EE \
locale-thonny-eu-ES \
locale-thonny-fa-IR \
locale-thonny-fi-FI \
locale-thonny-fr-FR \
locale-thonny-hi-IN \
locale-thonny-hu-HU \
locale-thonny-hy-AM \
locale-thonny-id-ID \
locale-thonny-is-IS \
locale-thonny-it-IT \
locale-thonny-ja-JP \
locale-thonny-ko-KR \
locale-thonny-lt-LT \
locale-thonny-ml-IN \
locale-thonny-nb-NO \
locale-thonny-nl-NL \
locale-thonny-nn-NO \
locale-thonny-pl-PL \
locale-thonny-pt-BR \
locale-thonny-pt-PT \
locale-thonny-ro-RO \
locale-thonny-ru-RU \
locale-thonny-sk-SK \
locale-thonny-sl-SI \
locale-thonny-sq-AL \
locale-thonny-sv-SE \
locale-thonny-ta-IN \
locale-thonny-th-TH \
locale-thonny-tr-TR \
locale-thonny-uk-UA \
locale-thonny-vi-VN \
locale-thonny-zh-CN \
locale-thonny-zh-Hans \
locale-thonny-zh-TW \
thonny-lang"

RDEPENDS:${PN} += "python-abi \
thonny"

inherit rpm
