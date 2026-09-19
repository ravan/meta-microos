SUMMARY = "Service processor access via IPMI"
DESCRIPTION = "OpenIPMI allows access to IPMI information on a server and to abstract it. \
 \
The device driver is included in the Linux kernel, and there is a \
user-level library available for it as well. This OpenIPMI package \
also includes the ipmicmd program, a program that can inject and \
receive messages."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.37.13+git.1181df8"

RPM_NAME = "OpenIPMI-2.0.37.13+git.1181df8-1.6.aarch64.rpm"
RPM_HASH = "1790a83bae0acb7c31789ed886a342fbaad2411bcbd53fc3544d7879ff649798c867fc4b0ff6c67f749e9eb3f0d26eddd08f2bcbe9e2cd307bacdd22c89d3fb6"

RPROVIDES:${PN} += "OpenIPMI \
config-OpenIPMI \
ipmi-ui \
ipmicmd \
ipmilan \
libOpenIPMI.so.0 \
perl-OpenIPMI \
perl-OpenIPMI--argarray \
perl-OpenIPMI--iargarray \
perl-OpenIPMI--ipmi-args-t \
perl-OpenIPMI--ipmi-channel-access-t \
perl-OpenIPMI--ipmi-channel-info-t \
perl-OpenIPMI--ipmi-cmdlang-event-t \
perl-OpenIPMI--ipmi-cmdlang-t \
perl-OpenIPMI--ipmi-control-id-t \
perl-OpenIPMI--ipmi-control-t \
perl-OpenIPMI--ipmi-domain-id-t \
perl-OpenIPMI--ipmi-domain-t \
perl-OpenIPMI--ipmi-entity-id-t \
perl-OpenIPMI--ipmi-entity-t \
perl-OpenIPMI--ipmi-event-t \
perl-OpenIPMI--ipmi-fru-node-t \
perl-OpenIPMI--ipmi-fru-t \
perl-OpenIPMI--ipmi-lan-config-t \
perl-OpenIPMI--ipmi-lanparm-t \
perl-OpenIPMI--ipmi-mc-t \
perl-OpenIPMI--ipmi-mcid-t \
perl-OpenIPMI--ipmi-pef-config-t \
perl-OpenIPMI--ipmi-pef-t \
perl-OpenIPMI--ipmi-pet-t \
perl-OpenIPMI--ipmi-sensor-id-t \
perl-OpenIPMI--ipmi-sensor-t \
perl-OpenIPMI--ipmi-sol-config-t \
perl-OpenIPMI--ipmi-sol-conn-t \
perl-OpenIPMI--ipmi-solparm-t \
perl-OpenIPMI--ipmi-user-t \
perl-OpenIPMI--strconstarray \
perl-OpenIPMIc"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libIPMIlanserv.so.0 \
libOpenIPMIcmdlang.so.0 \
libOpenIPMIglib.so.0 \
libOpenIPMIposix.so.0 \
libOpenIPMIui.so.1 \
libOpenIPMIutils.so.0 \
libc.so.6 \
libgdbm.so.6 \
libglib-2.0.so.0 \
libgthread-2.0.so.0 \
libm.so.6 \
libnetsnmp.so.45 \
libpopt.so.0 \
libreadline.so.8 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
