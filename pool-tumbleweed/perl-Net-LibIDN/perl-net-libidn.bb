SUMMARY = "Net::LibIDN Perl module"
DESCRIPTION = "This module provides Perl bindings for GNU Libidn by Simon Josefsson \
(http://www.gnu.org/software/libidn/) in way that was heavily inspired by \
PHP bindings for the same library done by Turbo Fredriksson (http://php- \
idn.bayour.com/). \
 \
Authors: \
-------- \
    Thomas Jacob, http://internet24.de"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.12"

RPM_NAME = "perl-Net-LibIDN-0.12-16.57.aarch64.rpm"
RPM_HASH = "535b932d6a5f737d2daade1aff698e8184986878b51f8751aacf94ec0c7947d8a638283b789bb15e675778352162e946542cb3c220cb3c27b2e23f76ed7e60ef"

RPROVIDES:${PN} += "perl-Net--LibIDN \
perl-Net-LibIDN"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
