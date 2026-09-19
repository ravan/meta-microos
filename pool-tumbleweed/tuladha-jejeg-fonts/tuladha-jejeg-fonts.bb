SUMMARY = "Javanese Font"
DESCRIPTION = "Font supporting unicode codepoints from U+A980 to U+A9DF."
LICENSE = "OFL-1.1"

PV = "2.01"

RPM_NAME = "tuladha-jejeg-fonts-2.01-3.25.noarch.rpm"
RPM_HASH = "d92b0e392794837e21bbd878b2620547914a1f0d6f8aa36d0609e98153bde47836e31fcc2111e596f970fd3a7e2cef9148d4f55f1f2236c3380c21e9490318b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuladha-jejeg-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
