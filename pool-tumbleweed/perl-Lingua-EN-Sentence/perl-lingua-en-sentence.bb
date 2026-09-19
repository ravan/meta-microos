SUMMARY = "Split text into sentences"
DESCRIPTION = "The 'Lingua::EN::Sentence' module contains the function get_sentences, \
which splits text into its constituent sentences, based on a regular \
expression and a list of abbreviations (built in and given). \
 \
Certain well know exceptions, such as abbreviations, may cause incorrect \
segmentations. But some of them are already integrated into this code and \
are being taken care of. Still, if you see that there are words causing the \
get_sentences function to fail, you can add those to the module, so it \
notices them. Note that abbreviations are case sensitive, so 'Mrs.' is \
recognised but not 'mrs.'"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-Lingua-EN-Sentence-0.34-1.16.noarch.rpm"
RPM_HASH = "089613eb64d52be586bc0ddf9556ac7f535ca97a00c335048f2812dc49b4adcecf5e7c5f46cee94c17a71d2974045e7b1e4ccc8f252dc43e1ffb88542eab7e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--EN--Sentence \
perl-Lingua-EN-Sentence"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-warnings"

inherit rpm
