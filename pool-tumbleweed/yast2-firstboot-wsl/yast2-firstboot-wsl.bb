SUMMARY = "YaST2 firstboot settings for WSL images"
DESCRIPTION = "YaST2 firstboot settings for WSL images"
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-firstboot-wsl-5.0.2-1.2.noarch.rpm"
RPM_HASH = "637395d8d2492a1c89d560cc88ade1857e2020f9713eed55cb0af59b21ba2dcda7e145429e572081205f0f0a88c57258f798d09e7f62e565a565cac5ccb8a0fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-firstboot-wsl"

RDEPENDS:${PN} += "/usr/bin/sh \
yast2-firstboot"

inherit rpm
