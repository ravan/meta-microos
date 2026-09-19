SUMMARY = "YaST2 - Initial System Configuration"
DESCRIPTION = "The YaST firstboot utility runs after installation is completed.  It \
guides the user through a series of steps that allows for easier \
configuration of the machine. \
 \
YaST firstboot does not run by default and has	to be configured to run \
by the user or the system administrator. It is useful for image \
deployments where the system in the image is completely configured, \
however some last steps like root password and user logins have to be \
created to personalize the system."
LICENSE = "GPL-2.0-only"

PV = "5.0.2"

RPM_NAME = "yast2-firstboot-5.0.2-1.2.noarch.rpm"
RPM_HASH = "632426946534355e60feba5c5e382c9f116666bc03462c27011250672eeaf8d635546a264876a4aa3175fb45afbc656892b0ca7c95921edee37c7f736a589265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-firstboot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
yast2 \
yast2-configuration-management \
yast2-country \
yast2-installation \
yast2-network \
yast2-ruby-bindings"

inherit rpm
