SUMMARY = "Old Standard Font Family (OpenType Format)"
DESCRIPTION = "Old Standard was intended as a multilingual font family suitable for \
biblical, classical and medieval studies as well as for general-purpose \
typesetting in languages which use Greek or Cyrillic script. The font is \
currently available in three shapes: regular, italic and bold. Old \
Standard is still far from being finished, and yet it already covers \
a wide range of Latin, Greek and Cyrillic characters. It also supports \
early Cyrillic letters and signs (including those added in Unicode 5.1) \
and thus can be used for texts containing fragments in Old Slavonic and \
Church Slavonic languages. \
 \
This package contains fonts in OpenType format."
LICENSE = "OFL-1.1"

PV = "2.2"

RPM_NAME = "thessalonica-oldstandard-otf-fonts-2.2-11.26.noarch.rpm"
RPM_HASH = "f65c2722e10665cd9599e24b37baccdd2472d4e7df4bfd8818cc629512c19d465092db878b805c4247f0f253e66b6bc78009a39cc3bbb4e817199669da7519ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-el;ru \
oldstandard-fonts-otf \
thessalonica-oldstandard-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
