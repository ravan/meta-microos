SUMMARY = "Email reply parser"
DESCRIPTION = "Email reply parser."
LICENSE = "MIT"

PV = "0.5.12"

RPM_NAME = "python314-email-reply-parser-0.5.12-2.5.noarch.rpm"
RPM_HASH = "cab62d239ec6b4d59ab3c7537c08dbeda76080b1fc56d1ba17ebefa2a0c340f0316554e77292cd175a6ba1d18baa2225caea88f49aed78c1a545a69a29950b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-email-reply-parser \
python314-email-reply-parser \
python3dist-email-reply-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
