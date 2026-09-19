SUMMARY = "Old Standard Font Family (TrueType Format)"
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
This package contains fonts in TrueType format."
LICENSE = "OFL-1.1"

PV = "2.2"

RPM_NAME = "thessalonica-oldstandard-ttf-fonts-2.2-11.26.noarch.rpm"
RPM_HASH = "cf50b8f28163c12fba7d07050a064e6abf76242ab677e094ab60426498c99fa75ffc23b378aec4634a5e5858dc260e6b57dbee059ac4ae6068f153a0f5eb8986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oldstandard-fonts-ttf \
thessalonica-oldstandard-ttf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
