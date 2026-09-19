SUMMARY = "YaST2 Main Package"
DESCRIPTION = "This package contains scripts and data needed for SUSE Linux \
installation with YaST2"
LICENSE = "GPL-2.0-only"

PV = "5.0.21"

RPM_NAME = "yast2-5.0.21-1.2.aarch64.rpm"
RPM_HASH = "e71be147aaac945c48c31d84ceef282ebcfa82918fc784c0c16d21cf65b7afdcabdbb9f0b600f4bcb873394858ad7476b57723740bcb117bb29517f2f3476f3f"

RPROVIDES:${PN} += "perl-MailTable \
perl-MailTable--Aliases \
perl-MailTable--PostfixSenderCanonical \
perl-MailTable--PostfixVirtual \
perl-MailTable--SendmailGenerics \
perl-MailTable--SendmailVirtuser \
perl-SLPAPI \
yast2"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
augeas-lenses \
coreutils \
cpio \
fillup \
gpg2 \
hostname \
rpm \
rubygem-ruby-4.0.0-abstract-method \
rubygem-ruby-4.0.0-cfa \
rubygem-ruby-4.0.0-cheetah \
rubygem-ruby-4.0.0-nokogiri \
rubygem-ruby-4.0.0-simpleidn \
sysconfig \
yast2-core \
yast2-hardware-detection \
yast2-logs \
yast2-perl-bindings \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-ycp-ui-bindings \
yui-backend"

inherit rpm
