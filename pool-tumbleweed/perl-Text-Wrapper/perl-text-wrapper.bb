SUMMARY = "Word wrap text by breaking long lines"
DESCRIPTION = "Text::Wrapper provides simple word wrapping. It breaks long lines, but does \
not alter spacing or remove existing line breaks. If you're looking for \
more sophisticated text formatting, try the the Text::Format manpage \
module. \
 \
Reasons to use Text::Wrapper instead of Text::Format: \
 \
* * \
 \
  Text::Wrapper is significantly smaller. \
 \
* * \
 \
  It does not alter existing whitespace or combine short lines. It only \
  breaks long lines. \
 \
Again, if Text::Wrapper doesn't meet your needs, try Text::Format."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.05"

RPM_NAME = "perl-Text-Wrapper-1.05-3.42.noarch.rpm"
RPM_HASH = "fc403c3d48fb161b110bc24b13314443d2ef23c70a84e87f9c71d0959e8738a93aa97cbadb4aa747c3e6da17324a1d3a0df7c73983609b7c372a164b0f60f09f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Wrapper \
perl-Text-Wrapper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
