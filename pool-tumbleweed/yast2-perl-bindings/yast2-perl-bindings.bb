SUMMARY = "YaST2 - Perl Bindings"
DESCRIPTION = "This adds an embedded Perl interpreter to YaST2 as a plug-in (in other \
words it will be loaded only if required). This is a very efficient way \
of calling Perl from within YaST2 YCP scripts."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.5"

RPM_NAME = "yast2-perl-bindings-5.0.5-1.6.aarch64.rpm"
RPM_HASH = "90902cb4dd957f0282ee78a275f55a2c98d29a440bc9fa17aa4e168b392ce6a51bae085532ee769f6e54d737fef36db964e7a1fb3439df860babac6248beb7b0"

RPROVIDES:${PN} += "libYCP.so.2 \
libpy2lang-perl.so.2 \
perl-YaPI \
perl-YaST--YCP \
perl-YaST--YCP--Autoload \
perl-YaST--YCP--Boolean \
perl-YaST--YCP--Byteblock \
perl-YaST--YCP--Float \
perl-YaST--YCP--Integer \
perl-YaST--YCP--String \
perl-YaST--YCP--Symbol \
perl-YaST--YCP--Term \
yast2-perl-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libperl.so \
libpy2UI.so.2 \
libpy2wfm.so.2 \
libstdc++.so.6 \
liby2.so.4 \
liby2util.so.5 \
libycp.so.5 \
perl \
perl-Locale--gettext \
yast2-core \
yast2-ycp-ui-bindings"

inherit rpm
