SUMMARY = "Extra collection of rime schemas"
DESCRIPTION = "Extra collection of rime schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-extra-20250315-1.4.noarch.rpm"
RPM_HASH = "9b8bf2411f6d47359a10142476cd7bd21ddde89866b5e66a436fa8e8fafe322be10d23f536e9f3ea10f594537b75d614d921c3b63aeb8ef91203dd7e0bd6dfef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-extra"

RDEPENDS:${PN} += "rime-schema-array \
rime-schema-cantonese \
rime-schema-combo-pinyin \
rime-schema-double-pinyin \
rime-schema-emoji \
rime-schema-emoji-cantonese \
rime-schema-essay-simp \
rime-schema-ipa \
rime-schema-middle-chinese \
rime-schema-pinyin-simp \
rime-schema-quick \
rime-schema-scj \
rime-schema-soutzoe \
rime-schema-stenotype \
rime-schema-wubi \
rime-schema-wugniu"

inherit rpm
