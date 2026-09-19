SUMMARY = "Performance Co-Pilot (PCP) Perl bindings and documentation"
DESCRIPTION = "The PCP::PMDA Perl module contains the language bindings for \
building Performance Metric Domain Agents (PMDAs) using Perl. \
Each PMDA exports performance data for one specific domain, for \
example the operating system kernel, Cisco routers, a database, \
an application, etc."
LICENSE = "GPL-2.0+"

PV = "6.3.8"

RPM_NAME = "perl-PCP-PMDA-6.3.8-3.1.aarch64.rpm"
RPM_HASH = "fccf9bcf5b7ac0ca8f82a0f7c0f45f8f84efcab58277cdfbf2781b0b6bca5a832c31f1eb6667f767d1bba7c9aec5d4628390f5b15660e8d07f67eb3c693513f1"

RPROVIDES:${PN} += "perl-PCP--PMDA \
perl-PCP-PMDA"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3 \
libpcp3 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
