SUMMARY = "YaST2 - Online Update (YOU)"
DESCRIPTION = "Desktop files for YaST2 online update"
LICENSE = "GPL-2.0-only"

PV = "5.0.1"

RPM_NAME = "yast2-online-update-frontend-5.0.1-1.2.noarch.rpm"
RPM_HASH = "9e4747c955add98090d456bb5b001e8e3c84c0720938579555307ffb8315a0300451c4f99cba3792ef08f261690a52ec9149d276f81f29e0550a8dacb0f45a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-online-update-frontend"

RDEPENDS:${PN} += "yast2-online-update"

inherit rpm
