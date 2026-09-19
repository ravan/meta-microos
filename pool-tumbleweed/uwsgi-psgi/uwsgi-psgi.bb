SUMMARY = "PSGI Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains the PSGI plugin for running Perl applications that \
support the PSGI protocol."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-psgi-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "3fee15d8e717cb96410fa774b9eb9cdaa2ce5590700f1161bdd1f7797005fc6f9e5ef903e5bdab327e5a111f4d6ff75548d5d764eb261cdca835fbda89bc61ae"

RPROVIDES:${PN} += "uwsgi-psgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl \
uwsgi"

inherit rpm
