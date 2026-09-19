SUMMARY = "Shorter command of zypper"
DESCRIPTION = "A set of alias definitions (actually implemented using sh functions) \
for zypper: \
 \
- zp: sudo zypper \
- zi: sudo zypper install \
- zr: sudo zypper remove \
- zu: sudo zypper update (Leap) or sudo zypper dup (Tumbleweed) \
- zs: sudo zypper search \
 \
Have a lot of fun..."
LICENSE = "GPL-3.0"

PV = "0.2.0"

RPM_NAME = "zp-0.2.0-1.19.noarch.rpm"
RPM_HASH = "1a86fbda25cb9cef205dfc05915dec8f4472798f694f6ace0a9d12a70b706d098d5d390ad8a028d6885cd27e670d18cf8f952f30811883c1baf60ea197c789ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zp"

RDEPENDS:${PN} += "zypper"

inherit rpm
