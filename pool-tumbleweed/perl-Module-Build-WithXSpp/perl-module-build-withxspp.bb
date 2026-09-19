SUMMARY = "XS++ enhanced flavour of Module::Build"
DESCRIPTION = "This subclass of Module::Build adds some tools and processes to make it \
easier to use for wrapping C++ using XS++ (ExtUtils::XSpp). \
 \
There are a few minor differences from using 'Module::Build' for an \
ordinary XS module and a few conventions that you should be aware of as an \
XS++ module author. They are documented in the 'FEATURES AND CONVENTIONS' \
section below. But if you can't be bothered to read all that, you may \
choose skip it and blindly follow the advice in 'JUMP START FOR THE \
IMPATIENT'. \
 \
An example of a full distribution based on this build tool can be found in \
the ExtUtils::XSpp distribution under _examples/XSpp-Example_. Using that \
example as the basis for your 'Module::Build::WithXSpp'-based distribution \
is probably a good idea."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.140.0"

RPM_NAME = "perl-Module-Build-WithXSpp-0.140.0-1.7.noarch.rpm"
RPM_HASH = "3f783db62ed7fef9c67420d9f023deb2bc1db37bca02452649e3ae97b6f6708442d84222e43118636a3c05d2e796935d1be5840c9b2fffe98b7a2019edcd3900"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Build--WithXSpp \
perl-Module-Build-WithXSpp"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-ExtUtils--CBuilder \
perl-ExtUtils--CppGuess \
perl-ExtUtils--ParseXS \
perl-ExtUtils--Typemaps \
perl-ExtUtils--XSpp \
perl-Module--Build"

inherit rpm
