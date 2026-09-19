SUMMARY = "Helps troubleshoot SELinux problems"
DESCRIPTION = "This package provides a set of analysis plugins for use with \
setroubleshoot. Each plugin has the capacity to analyze SELinux AVC \
data and system data to provide user friendly reports describing how \
to interpret SELinux AVC denials."
LICENSE = "GPL-3.0-or-later"

PV = "3.3.15"

RPM_NAME = "setroubleshoot-plugins-3.3.15-2.1.noarch.rpm"
RPM_HASH = "a9792107f75d563bcb3efb581f15afe65109bf4b73854dfdc17c018631b3bc3ff565511c9f896b392128ef5fc6522344be69ed5bbacef7e678ab9ca04d5f3711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "setroubleshoot-plugins"

RDEPENDS:${PN} += "setroubleshoot-server"

inherit rpm
