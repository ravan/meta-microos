SUMMARY = "Rime scheme to input emoji with cantonese wording"
DESCRIPTION = "rime scheme to input emoji with cantonese wording."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-emoji-cantonese-20250315-1.4.noarch.rpm"
RPM_HASH = "934c12ece817378ea71f87713434f9c3ac1d42da3c1da8938875d3d5d07a2bf9e1b152556ebda947af901e82e47b3e601e9add8d7506befa485f15e46078b31b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-emoji-cantonese"

RDEPENDS:${PN} += ""

inherit rpm
