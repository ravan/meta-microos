SUMMARY = "Mono Addins Framework"
DESCRIPTION = "Mono.Addins is a generic framework for creating extensible \
applications, and for creating libraries which extend those \
applications."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "mono-addins-1.3.3-3.16.noarch.rpm"
RPM_HASH = "a1d7e92c14dbe083aa21bc90e49833642d7cbee4701a2641fd1545595ccb9c92abbbc1dbd47d766b77f24c0a81ba72faedeb7cdceef78f213da7285d61957c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Mono.Addins \
mono-Mono.Addins.CecilReflector \
mono-Mono.Addins.Gui \
mono-Mono.Addins.Setup \
mono-addins \
mono-mautil \
mono-policy.0.2.Mono.Addins \
mono-policy.0.2.Mono.Addins.CecilReflector \
mono-policy.0.2.Mono.Addins.Gui \
mono-policy.0.2.Mono.Addins.Setup \
mono-policy.0.3.Mono.Addins \
mono-policy.0.3.Mono.Addins.CecilReflector \
mono-policy.0.3.Mono.Addins.Gui \
mono-policy.0.3.Mono.Addins.Setup \
mono-policy.0.4.Mono.Addins \
mono-policy.0.4.Mono.Addins.CecilReflector \
mono-policy.0.4.Mono.Addins.Gui \
mono-policy.0.4.Mono.Addins.Setup \
mono-policy.0.5.Mono.Addins \
mono-policy.0.5.Mono.Addins.CecilReflector \
mono-policy.0.5.Mono.Addins.Gui \
mono-policy.0.5.Mono.Addins.Setup \
mono-policy.0.6.Mono.Addins \
mono-policy.0.6.Mono.Addins.CecilReflector \
mono-policy.0.6.Mono.Addins.Gui \
mono-policy.0.6.Mono.Addins.Setup"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-ICSharpCode.SharpZipLib \
mono-Mono.Cairo \
mono-Mono.Posix \
mono-System \
mono-System.Core \
mono-System.Xml \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib \
mono-pango-sharp"

inherit rpm
