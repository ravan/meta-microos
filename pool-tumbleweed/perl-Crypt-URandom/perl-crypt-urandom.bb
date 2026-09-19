SUMMARY = "Provide non blocking randomness"
DESCRIPTION = "This Module is intended to provide an interface to the strongest available \
source of non-blocking randomness on the current platform. Platforms \
currently supported are anything supporting getrandom(2), /dev/urandom and \
versions of Windows greater than or equal to Windows 2000."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.550.0"

RPM_NAME = "perl-Crypt-URandom-0.550.0-1.5.aarch64.rpm"
RPM_HASH = "be58a0bffd0426a29d441ab9ead067b76edeee68a27fb32dbc8e42e12ff8df1bfda0da937a692d8760fc4c857a2282feadfd5526c54329b7422e28d82667dd97"

RPROVIDES:${PN} += "perl-Crypt--URandom \
perl-Crypt-URandom"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Carp"

inherit rpm
