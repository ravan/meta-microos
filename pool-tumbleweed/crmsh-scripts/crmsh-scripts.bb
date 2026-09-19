SUMMARY = "Crm Shell Cluster Scripts"
DESCRIPTION = "Cluster scripts for crmsh. The cluster scripts can be run \
directly from the crm command line, or used by user interfaces \
like hawk to implement configuration wizards."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.0+20260828.be794583"

RPM_NAME = "crmsh-scripts-5.1.0+20260828.be794583-1.1.noarch.rpm"
RPM_HASH = "29e9a0bb495c1713a1249dec8e9494ab94ad4b4f7ea0fd2df49e48819cb8d972359cc30cef34d3aabfd5352dc1b543bf619ffa7c4708bc77b859a5d753853f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crmsh-scripts"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
