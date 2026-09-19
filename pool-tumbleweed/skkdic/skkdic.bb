SUMMARY = "SKK (Simple Kana-Kanji) dictionary files."
DESCRIPTION = "main dictionary for SKK."
LICENSE = "Unicode-DFS-2016"

PV = "20240829"

RPM_NAME = "skkdic-20240829-2.4.noarch.rpm"
RPM_HASH = "60e5e63621a79a207acaef3580c8bbe11333c5e193aac5378ca6c561de4bdf44da8d42323f070061b7162e56ed0359432bbf42fb04c7a9aa1ad3f8a3ea3c9afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-scim-skk-ja \
skkdic"

RDEPENDS:${PN} += "info"

inherit rpm
