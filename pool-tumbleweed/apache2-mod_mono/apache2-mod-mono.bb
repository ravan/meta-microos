SUMMARY = "Run ASP.NET Pages on Unix with Apache and Mono"
DESCRIPTION = "mod_mono is a module that interfaces Apache with Mono and allows \
running ASP.NET pages on Unix and Unix-like systems. To load the module \
into Apache, run the command 'a2enmod mono' as root."
LICENSE = "Apache-2.0"

PV = "3.13"

RPM_NAME = "apache2-mod_mono-3.13-1.20.aarch64.rpm"
RPM_HASH = "d45fb324c68ff3cd163580fd5ac06d44d89ffcb0b943dabe3e35e82bb52bfa38c87552bcbd730282066d55ae49dac1ad739ae0f0323036275d76f6ff79ae32d9"

RPROVIDES:${PN} += "apache2-mod-mono \
config-apache2-mod-mono \
mod-mono"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
xsp"

inherit rpm
