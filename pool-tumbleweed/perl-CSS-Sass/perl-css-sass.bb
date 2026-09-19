SUMMARY = "Compile .scss files using libsass"
DESCRIPTION = "CSS::Sass provides a perl interface to libsass, a fairly complete Sass \
compiler written in C++. It is currently around ruby sass 3.3/3.4 feature \
parity and heading towards full 3.4 compatibility. It can compile .scss and \
.sass files."
LICENSE = "MIT"

PV = "3.6.4"

RPM_NAME = "perl-CSS-Sass-3.6.4-1.8.aarch64.rpm"
RPM_HASH = "c807694f997253643eeab519ebf6a1fbe949c5f38355711ce5e8f82ff37e22dcb3845db8c331ee36a0725956b67b16fd39f5e09d28712b6b76df52abde4f3845"

RPROVIDES:${PN} += "libsass.so \
perl-CSS--Sass \
perl-CSS--Sass--Plugins \
perl-CSS--Sass--Value \
perl-CSS--Sass--Value--Boolean \
perl-CSS--Sass--Value--Color \
perl-CSS--Sass--Value--Error \
perl-CSS--Sass--Value--List \
perl-CSS--Sass--Value--List--Comma \
perl-CSS--Sass--Value--List--Space \
perl-CSS--Sass--Value--Map \
perl-CSS--Sass--Value--Null \
perl-CSS--Sass--Value--Number \
perl-CSS--Sass--Value--String \
perl-CSS--Sass--Value--String--Constant \
perl-CSS--Sass--Value--String--Quoted \
perl-CSS--Sass--Watchdog \
perl-CSS--Sass--Watchdog--Queue \
perl-CSS-Sass"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Encode--Locale \
perl-Filesys--Notify--Simple \
perl-List--Util \
perl-version"

inherit rpm
