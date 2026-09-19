SUMMARY = "Guess OpenSSL include path"
DESCRIPTION = "Crypt::OpenSSL::Guess provides helpers to guess OpenSSL include path on any \
platforms. \
 \
Often macOS's homebrew OpenSSL cause a problem on installation due to \
include path is not added. Some CPAN module provides to modify include path \
with configure-args, but Carton or Module::CPANfile is not supported to \
pass configure-args to each modules. Crypt::OpenSSL::* modules should use \
it on your Makefile.PL. \
 \
This module resolves the include path by Net::SSLeay's workaround. Original \
code is taken from 'inc/Module/Install/PRIVATE/Net/SSLeay.pm' by \
Net::SSLeay."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.150.0"

RPM_NAME = "perl-Crypt-OpenSSL-Guess-0.150.0-1.7.noarch.rpm"
RPM_HASH = "ed978ccefc0fafad0a4684fbfd72369ace0846f90364a609546cb5b7fa1c1030a0239cba7c916cbb8bfcbff477536a9e0edbaae5d89abecbe7a0816bbe6430d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Guess \
perl-Crypt-OpenSSL-Guess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
