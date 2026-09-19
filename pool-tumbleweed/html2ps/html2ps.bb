SUMMARY = "HTML to PostScript Converter"
DESCRIPTION = "An HTML to PostScript converter written in Perl.  Html2ps understands \
many of the HTML 4.0 features.	From the home page \
(http://www.tdb.uu.se/~jan/html2ps.html): \
 \
* Many ways to control the appearance; this is mostly done using \
   configuration files. \
* Support for processing multiple documents, can be done \
   automatically by recursively following links. \
* A table of contents can be generated, either from the links in a \
   document or automatically from document headings. \
* Configurable page headers and footers that can, for example, \
   contain document title, URL, page number, current heading, and \
   date. \
* Automatic hyphenation and text justification can be selected."
LICENSE = "GPL-2.0-or-later"

PV = "1.0b7"

RPM_NAME = "html2ps-1.0b7-1.5.noarch.rpm"
RPM_HASH = "d6265f7f4dac9986cb5e14bcf31c487cb2daeb1516010af6823ce301254c999738f2e21f011688c71d6c71160e9fa6693b5ba1a5e928ed2d86c6fd449cbd9cab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-html2ps \
html2ps"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/wish \
ImageMagick \
ghostscript-any \
gv \
netpbm \
perl \
perl-libwww-perl"

inherit rpm
