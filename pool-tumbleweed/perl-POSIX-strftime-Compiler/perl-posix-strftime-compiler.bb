SUMMARY = "GNU C library compatible strftime for loggers and servers"
DESCRIPTION = "POSIX::strftime::Compiler provides GNU C library compatible strftime(3). \
But this module will not affected by the system locale. This feature is \
useful when you want to write loggers, servers and portable applications. \
 \
For generate same result strings on any locale, POSIX::strftime::Compiler \
wraps POSIX::strftime and converts some format characters to perl code"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.460.0"

RPM_NAME = "perl-POSIX-strftime-Compiler-0.460.0-2.12.noarch.rpm"
RPM_HASH = "fc80767a2ea68f2ef4354666dadff5b352cb9ea3d6e50bace39dfaadafcfc26bbc2c69ff8aa9d0298ab4c721d7bbe5a415eb55857ec9cd534e41eab50e36495d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-POSIX--strftime--Compiler \
perl-POSIX-strftime-Compiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
