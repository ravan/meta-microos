SUMMARY = "PerlIO layer to use the encoding of the current locale"
DESCRIPTION = "This is mostly a per-filehandle version of the 'open' pragma, when used \
under the form \
 \
    use open ':locale'; \
 \
The encoding for the opened file will be set to the encoding corresponding \
to the locale currently in effect, if perl can guess it."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.10"

RPM_NAME = "perl-PerlIO-locale-0.10-1.54.aarch64.rpm"
RPM_HASH = "ef448c82ba9563a80b86e462685d66aef98a44d7c974392f363dd0e5219c1ef8fe25dd6ec4736c3f51528ce7f1e776938d823e8399147fdf7af287aa93a44717"

RPROVIDES:${PN} += "perl-PerlIO--locale \
perl-PerlIO-locale"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
