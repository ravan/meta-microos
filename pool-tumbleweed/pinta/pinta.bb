SUMMARY = "Image editing application"
DESCRIPTION = "Pinta is a free, open source drawing/editing application designed \
after Paint.NET. Its goal is to provide users with a simple yet \
powerful way to draw and manipulate images."
LICENSE = "MIT"

PV = "1.7.1"

RPM_NAME = "pinta-1.7.1-1.12.noarch.rpm"
RPM_HASH = "260971b9c789efb8a16f04a9ce5ff2363c7055abc89d2b17e07d06cd81f06b74ea5af7e8dece07622f44df8622b531f2757f8ef347b0e9eb7e87cb7afc4a7571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Pinta \
mono-Pinta.Core \
mono-Pinta.Docking \
mono-Pinta.Effects \
mono-Pinta.Gui.Widgets \
mono-Pinta.Resources \
mono-Pinta.Tools \
pinta"

RDEPENDS:${PN} += "/usr/bin/sh \
mono-ICSharpCode.SharpZipLib \
mono-Mono.Addins \
mono-Mono.Addins.Gui \
mono-Mono.Addins.Setup \
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
