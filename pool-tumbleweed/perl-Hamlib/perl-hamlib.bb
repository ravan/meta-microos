SUMMARY = "Perl bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.7.2"

RPM_NAME = "perl-Hamlib-4.7.2-1.3.aarch64.rpm"
RPM_HASH = "7ad494ae01b99a7715be8310d708849341bb2aa04fc9c931924c33db4f23c978aa81b56843cb777197b66fa9818d1362a5873f18275a2e693e7254fbd78b9287"

RPROVIDES:${PN} += "perl-Hamlib \
perl-Hamlib--Amp \
perl-Hamlib--Rig \
perl-Hamlib--Rot \
perl-Hamlib--amp-caps \
perl-Hamlib--amp-state \
perl-Hamlib--cal-table \
perl-Hamlib--cal-table-float \
perl-Hamlib--cal-table-float-table \
perl-Hamlib--cal-table-table \
perl-Hamlib--chan-list \
perl-Hamlib--channel \
perl-Hamlib--channel-cap \
perl-Hamlib--channelArray \
perl-Hamlib--confparams \
perl-Hamlib--confparams-u \
perl-Hamlib--confparams-u-c \
perl-Hamlib--confparams-u-n \
perl-Hamlib--deferred-config-header \
perl-Hamlib--deferred-config-item \
perl-Hamlib--ext-list \
perl-Hamlib--filter-list \
perl-Hamlib--freq-range-t \
perl-Hamlib--gran \
perl-Hamlib--multicast-s \
perl-Hamlib--rig-callbacks \
perl-Hamlib--rig-caps \
perl-Hamlib--rig-spectrum-avg-mode \
perl-Hamlib--rig-spectrum-line \
perl-Hamlib--rig-spectrum-scope \
perl-Hamlib--rig-state \
perl-Hamlib--rot-caps \
perl-Hamlib--rot-state \
perl-Hamlib--toneArray \
perl-Hamlib--tuning-step-list \
perl-Hamlib--value-t \
perl-Hamlib--value-t-b \
perl-Hamlibc"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhamlib.so.4 \
perl-base"

inherit rpm
