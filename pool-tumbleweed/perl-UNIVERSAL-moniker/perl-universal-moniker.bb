SUMMARY = "UNIVERAL::moniker"
DESCRIPTION = "Class names in Perl often don't sound great when spoken, or look good when \
written in prose. For this reason, we tend to say things like 'customer' or \
'basket' when we are referring to 'My::Site::User::Customer' or \
'My::Site::Shop::Basket'. We thought it would be nice if our classes knew \
what we would prefer to call them. \
 \
This module will add a 'moniker' (and 'plural_moniker') method to \
'UNIVERSAL', and so to every class or module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.08"

RPM_NAME = "perl-UNIVERSAL-moniker-0.08-14.10.noarch.rpm"
RPM_HASH = "4ca3143d1d8ff893f1480846a06eb56f029548fd8d36f4aadad6e6167157eceb603a3c0c75c5a2e314e4d2fb0395faf23f391b072b8dda4afde7554e915c6ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-UNIVERSAL \
perl-UNIVERSAL--moniker \
perl-UNIVERSAL-moniker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
