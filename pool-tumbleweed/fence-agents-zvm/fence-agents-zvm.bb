SUMMARY = "Fence agent for IBM z/VM over IP"
DESCRIPTION = "Fence agent for IBM z/VM over IP."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "4.17.0+git.1786356985.d90bec5f"

RPM_NAME = "fence-agents-zvm-4.17.0+git.1786356985.d90bec5f-1.1.noarch.rpm"
RPM_HASH = "3765d66c27b9dd7dcdb6eb1c5b0cae4fe49d1646068c0ac1931ce9a9a0c251a79ea0271e2a2fd029a658c5f46361b691cd8971b04f082ebfab8dafb732ee9966"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fence-agents-zvm"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
fence-agents-common"

inherit rpm
