SUMMARY = "Semantic grep tool for C, based on coccinelle"
DESCRIPTION = "coccigrep is a semantic grep for the C language based on coccinelle. It can be \
used to find where a given structure is used in code files. coccigrep depends on \
the spatch program which comes with coccinelle."
LICENSE = "GPL-3.0-only"

PV = "1.21"

RPM_NAME = "coccigrep-1.21-1.4.noarch.rpm"
RPM_HASH = "ce76a9fc50c92e017b4c32895b30eb1b14df41a25243870e6515e9e653334810f0033447b1348859d8a57197445223c2bb7ef37be452283a70c13fea1beb754c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coccigrep \
python3.13dist-coccigrep \
python3dist-coccigrep"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
coccinelle \
python-abi \
python3"

inherit rpm
