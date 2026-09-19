SUMMARY = "Upstream branding of lxqt-globalkeys"
DESCRIPTION = "This package provides the upstream look and feel for lxqt-globalkeys."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "lxqt-globalkeys-branding-upstream-2.4.0-1.2.noarch.rpm"
RPM_HASH = "6459a8f0d147bb730ebee9d2796c126758c44732c2899c1be1b63b5295ea656976f362f7b59f29b541f1be94b598569cf4642db565afcc817db6c55f8b3f6814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxqt-globalkeys-branding-upstream \
lxqt-globalkeys-branding \
lxqt-globalkeys-branding-upstream"

RDEPENDS:${PN} += "lxqt-globalkeys"

inherit rpm
