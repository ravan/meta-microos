SUMMARY = "All rime input schemas"
DESCRIPTION = "All rime input schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-all-20250315-1.4.noarch.rpm"
RPM_HASH = "15bac9ec9dcccb20bf217390b87b732583e2101552c9160f3a46af361f492bcd98ec540b75ffa3ff5692410934e88ae58a70159f088a850bde785fa5ff3da3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brise \
rime-schema-all"

RDEPENDS:${PN} += "rime-schema-array \
rime-schema-bopomofo \
rime-schema-cangjie \
rime-schema-cantonese \
rime-schema-combo-pinyin \
rime-schema-custom \
rime-schema-double-pinyin \
rime-schema-emoji \
rime-schema-emoji-cantonese \
rime-schema-essay \
rime-schema-essay-simp \
rime-schema-ipa \
rime-schema-luna-pinyin \
rime-schema-middle-chinese \
rime-schema-pinyin-simp \
rime-schema-prelude \
rime-schema-quick \
rime-schema-scj \
rime-schema-soutzoe \
rime-schema-stenotype \
rime-schema-stroke \
rime-schema-terra-pinyin \
rime-schema-wubi \
rime-schema-wugniu"

inherit rpm
