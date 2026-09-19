SUMMARY = "Calculate color (sets), IO many spaces and formats"
DESCRIPTION = "Graphics::Toolkit::Color, for short *GTC*, is the top level API of this \
library and the only package a regular user should be concerned with. Its \
main purpose is the creation of related colors or sets of them, such as \
gradients, complements and more. But if you want to convert, quantize, \
round or reformat color definitions or translate from and to color names, \
it can be helpful too. \
 \
This page will give you a quick overview of all GTC methods. The Manual \
contains deeper explanations and describes every argument and topic of \
interest in detail. Therefore each chapter here starts with a link to the \
appropriate paragraph of a manual page. \
 \
While this module can understand and output color values of many (33) color \
spaces, RGB is the internal and primary one for input and output, because \
GTC is about colors that can be shown on the screen, and these are usually \
encoded in _RGB_ (nonlinear standard RGB). However, many color calculations \
are operating by default in _OKLAB_ or _OKHSL_ to give perceptually uniform \
results. \
 \
Each GTC object represents one color and is read-only. It has no runtime \
dependencies. Only Test::Simple and Test::Warn are needed for testing. The \
behavior of error messages can be chosen, but defaults to using Carp."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.220.0"

RPM_NAME = "perl-Graphics-Toolkit-Color-2.220.0-1.3.noarch.rpm"
RPM_HASH = "b35dab249e07df1d36346ab898f948f6216d3c219f8a8feafb7fbb958ed6272df1f3a989df50d87d5127d772d70ff4dfc9936fd60e5bf8130a5a1f1783ad6069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Graphics--Toolkit--Color \
perl-Graphics--Toolkit--Color--Calculator \
perl-Graphics--Toolkit--Color--Error \
perl-Graphics--Toolkit--Color--Name \
perl-Graphics--Toolkit--Color--Name--Constant \
perl-Graphics--Toolkit--Color--Name--Scheme \
perl-Graphics--Toolkit--Color--SetCalculator \
perl-Graphics--Toolkit--Color--Space \
perl-Graphics--Toolkit--Color--Space--Basis \
perl-Graphics--Toolkit--Color--Space--Format \
perl-Graphics--Toolkit--Color--Space--Hub \
perl-Graphics--Toolkit--Color--Space--Instance--AdobeRGB \
perl-Graphics--Toolkit--Color--Space--Instance--AppleRGB \
perl-Graphics--Toolkit--Color--Space--Instance--CIELAB \
perl-Graphics--Toolkit--Color--Space--Instance--CIELCHab \
perl-Graphics--Toolkit--Color--Space--Instance--CIELCHuv \
perl-Graphics--Toolkit--Color--Space--Instance--CIELUV \
perl-Graphics--Toolkit--Color--Space--Instance--CIERGB \
perl-Graphics--Toolkit--Color--Space--Instance--CIEXYZ \
perl-Graphics--Toolkit--Color--Space--Instance--CMY \
perl-Graphics--Toolkit--Color--Space--Instance--CMYK \
perl-Graphics--Toolkit--Color--Space--Instance--DCIP3 \
perl-Graphics--Toolkit--Color--Space--Instance--DCIP3Linear \
perl-Graphics--Toolkit--Color--Space--Instance--DisplayP3 \
perl-Graphics--Toolkit--Color--Space--Instance--DisplayP3Linear \
perl-Graphics--Toolkit--Color--Space--Instance--HSB \
perl-Graphics--Toolkit--Color--Space--Instance--HSL \
perl-Graphics--Toolkit--Color--Space--Instance--HSV \
perl-Graphics--Toolkit--Color--Space--Instance--HWB \
perl-Graphics--Toolkit--Color--Space--Instance--Helper--OK \
perl-Graphics--Toolkit--Color--Space--Instance--HunterLAB \
perl-Graphics--Toolkit--Color--Space--Instance--NCol \
perl-Graphics--Toolkit--Color--Space--Instance--OKHSL \
perl-Graphics--Toolkit--Color--Space--Instance--OKHSV \
perl-Graphics--Toolkit--Color--Space--Instance--OKHWB \
perl-Graphics--Toolkit--Color--Space--Instance--OKLAB \
perl-Graphics--Toolkit--Color--Space--Instance--OKLCH \
perl-Graphics--Toolkit--Color--Space--Instance--ProPhotoRGB \
perl-Graphics--Toolkit--Color--Space--Instance--RGB \
perl-Graphics--Toolkit--Color--Space--Instance--RGBLinear \
perl-Graphics--Toolkit--Color--Space--Instance--Rec2020 \
perl-Graphics--Toolkit--Color--Space--Instance--Rec709 \
perl-Graphics--Toolkit--Color--Space--Instance--WideGamutRGB \
perl-Graphics--Toolkit--Color--Space--Instance--YIQ \
perl-Graphics--Toolkit--Color--Space--Instance--YPbPr \
perl-Graphics--Toolkit--Color--Space--Shape \
perl-Graphics--Toolkit--Color--Space--Util \
perl-Graphics--Toolkit--Color--Values \
perl-Graphics-Toolkit-Color"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
