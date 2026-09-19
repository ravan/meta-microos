SUMMARY = "Automatically upgrade and reboot the system when required"
DESCRIPTION = "Use this package to install and enable a systemd service for nightly upgrading \
and rebooting the system if devel:openQA packages are stable."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-auto-update-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "2d289b0bfb77f333b0524fec4fd2d5626fb3e5e3a75a891e7262a03a4574d3c3535963de2c871ebf67d61210419ccd7c8eda46827b0466e4aee51903f3c9bfd1"

RPROVIDES:${PN} += "openQA-auto-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common \
rebootmgr"

inherit rpm
