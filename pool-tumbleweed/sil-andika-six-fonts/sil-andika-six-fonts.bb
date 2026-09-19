SUMMARY = "Sans serif, Unicode-compliant Font For Literacy Use"
DESCRIPTION = "Andika Six is renamed version of Andika v6.200 with no other \
changes. Andika version 7 includes metrics changes that \
could cause lines, paragraphs, and pages to reflow. Because \
of this we wanted to provide a font that reproduced the \
exact metrics and behavior of Andika v6.200 and could be \
installed at the same time as the newest Andika (v7 and beyond). \
Andika v7 is still the best font for most people to use. \
But if you have documents prepared with Andika v6.200 and \
need to preserve the spacing, you can install Andika Six, \
change the doc to use it instead of Andika, and avoid any \
issues with reflow. Then you can use Andika v7 for new \
documents and benefit from the many improvements in this and \
future versions."
LICENSE = "OFL-1.1"

PV = "6.210"

RPM_NAME = "sil-andika-six-fonts-6.210-1.4.noarch.rpm"
RPM_HASH = "7745070e2a316a8eeb7368d8a82f7f4d72a731aca2e9ddd575d1e6b8efeee9614e6ff73af3b265e99e583a86a0970999f9f3afcb906cb9b00274d639aea1042e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sil-andika-six-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
