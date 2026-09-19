SUMMARY = "Extension for HTML::Element"
DESCRIPTION = "HTML-Element-Extended is a package of several enhanced HTML::Element \
classes, most of which arose during the effort to implement an \
HTML::Element based table class. \
 \
The modules are: \
        HTML::ElementTable \
        HTML::ElementSuper \
        HTML::ElementGlob \
        HTML::ElementRaw \
 \
The resulting functionality enables: \
        tables \
        element globs \
        element coordinates \
        content replacement \
        content wrapping \
        element cloning \
        raw HTML string adoption"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.18"

RPM_NAME = "perl-HTML-Element-Extended-1.18-14.42.noarch.rpm"
RPM_HASH = "a7a5dad5cf25c9abbefd0c2a63d3b3e64a5719d4572887a0bf5eeb0ae9878fd0e19d939a6fec3055c8b66c9e207d0f8c48296cad19e2b8adbab76a3d589cf8cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--ElementGlob \
perl-HTML--ElementRaw \
perl-HTML--ElementSuper \
perl-HTML--ElementSuper--ContentWatchdog \
perl-HTML--ElementTable \
perl-HTML--ElementTable--DataElement \
perl-HTML--ElementTable--Element \
perl-HTML--ElementTable--HeaderElement \
perl-HTML--ElementTable--RowElement \
perl-HTML--ElementTable--RowGlob \
perl-HTML-Element-Extended"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Dumper \
perl-HTML--Element"

inherit rpm
