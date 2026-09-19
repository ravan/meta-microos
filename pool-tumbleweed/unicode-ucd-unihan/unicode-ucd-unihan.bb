SUMMARY = "Unicode Han Database"
DESCRIPTION = "This package contains Unihan.zip which contains the data files for the Unified \
Han database of Hanzi/Kanji/Hanja Chinese characters."
LICENSE = "Unicode-TOU"

PV = "17.0.0"

RPM_NAME = "unicode-ucd-unihan-17.0.0-1.3.noarch.rpm"
RPM_HASH = "bc06e72360c0202565eae6f653f534d41346f5bd6a5fd911a14cebd7c01989ddff091eb83afb967f57cf0126731cbd2019bc7ab62a1f0dc471848b6eb3a4534a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unicode-ucd-unihan"

RDEPENDS:${PN} += "unicode-ucd"

inherit rpm
