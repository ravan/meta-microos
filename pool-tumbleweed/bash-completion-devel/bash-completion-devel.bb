SUMMARY = "The Configuration of Programmable Completion for Bash"
DESCRIPTION = "This package contains the package configuration file of the \
package bash-completion."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.0"

RPM_NAME = "bash-completion-devel-2.17.0-1.1.noarch.rpm"
RPM_HASH = "9216002142c2d4d92586ec96f122835d83d80c41e6e91f2e70664b421f0c4f9481874df83f5221c9ad8e94a89a85c971733a03a1243fecbecf3292f8880915e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-completion-/usr/share/pkgconfig/bash-completion.pc \
bash-completion-devel \
pkgconfig-bash-completion"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
