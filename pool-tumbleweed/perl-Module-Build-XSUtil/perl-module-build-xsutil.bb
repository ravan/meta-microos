SUMMARY = "Module::Build class for building XS modules"
DESCRIPTION = "Module::Build::XSUtil is subclass of Module::Build for support building XS \
modules. \
 \
This is a list of a new parameters in the Module::Build::new method: \
 \
* needs_compiler_c99 \
 \
This option checks C99 compiler's availability. If it's not available, \
Build.PL exits by 0. \
 \
* needs_compiler_cpp \
 \
This option checks C++ compiler's availability. If it's not available, \
Build.PL exits by 0. \
 \
In addition, append 'extra_compiler_flags' and 'extra_linker_flags' for \
C++. \
 \
* generate_ppport_h \
 \
Genereate ppport.h by Devel::PPPort. \
 \
* generate_xshelper_h \
 \
Genereate xshelper.h which is a helper header file to include EXTERN.h, \
perl.h, XSUB.h and ppport.h, and defines some portability stuff which are \
not supported by ppport.h. \
 \
It is porting from Module::Install::XSUtil. \
 \
* cc_warnings \
 \
Enable compiler warnings flag. It is enable by default. \
 \
* -g options \
 \
If invoke Build.PL with '-g' option, It will build with debug options."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.190.0"

RPM_NAME = "perl-Module-Build-XSUtil-0.190.0-1.5.aarch64.rpm"
RPM_HASH = "f1a965af20dc08f62a06a8ddbaedafdac3c56c7b3c365f6aa5f8cd88ad10e72e1ae8b65811a9043675e37ec136369edebf23670ee9c2168ef1dacc0fd19754f6"

RPROVIDES:${PN} += "perl-Module--Build--XSUtil \
perl-Module-Build-XSUtil"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Devel--CheckCompiler \
perl-ExtUtils--CBuilder \
perl-parent"

inherit rpm
