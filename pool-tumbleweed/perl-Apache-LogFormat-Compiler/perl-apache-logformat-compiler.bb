SUMMARY = "Compile a log format string to perl-code"
DESCRIPTION = "Compile a log format string to perl-code. For faster generation of \
access_log lines."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.360.0"

RPM_NAME = "perl-Apache-LogFormat-Compiler-0.360.0-1.7.noarch.rpm"
RPM_HASH = "7778c24f541b1947e4a02c96c1ffa1cd75254978ca021f3fb79e902b4b6b72cba8d9b344637f50e1828d7a15c9b028fcebf170723e6b9ae87534db2fe60e7295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Apache--LogFormat--Compiler \
perl-Apache-LogFormat-Compiler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-POSIX--strftime--Compiler"

inherit rpm
