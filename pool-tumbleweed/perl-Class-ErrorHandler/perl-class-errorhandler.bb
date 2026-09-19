SUMMARY = "Base class for error handling"
DESCRIPTION = "_Class::ErrorHandler_ provides an error-handling mechanism that's generic \
enough to be used as the base class for a variety of OO classes. Subclasses \
inherit its two error-handling methods, _error_ and _errstr_, to \
communicate error messages back to the calling program. \
 \
On failure (for whatever reason), a subclass should call _error_ and return \
to the caller; _error_ itself sets the error message internally, then \
returns 'undef'. This has the effect of the method that failed returning \
'undef' to the caller. The caller should check for errors by checking for a \
return value of 'undef', and calling _errstr_ to get the value of the error \
message on an error. \
 \
As demonstrated in the the SYNOPSIS manpage, _error_ and _errstr_ work as \
both class methods and object methods."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.04"

RPM_NAME = "perl-Class-ErrorHandler-0.04-1.31.noarch.rpm"
RPM_HASH = "665db8ab761ba0222e6f7b2e816043fa1595b6b4ddaa4ede6f81dcbd8ca0f0a62b57474e2c35fd57b7a5b269945e1a0e664129e1b288975cdebcb5b3f91d22b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--ErrorHandler \
perl-Class-ErrorHandler"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
