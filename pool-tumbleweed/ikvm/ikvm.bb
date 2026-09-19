SUMMARY = "A JVM Based on the Mono Runtime"
DESCRIPTION = "This package provides IKVM.NET, an open source Java compatibility layer \
for Mono, which includes a Virtual Machine, a bytecode compiler, and \
various class libraries for Java, as well as tools for Java and Mono \
interoperability."
LICENSE = "BSD-3-Clause"

PV = "8.0.5449.1"

RPM_NAME = "ikvm-8.0.5449.1-1.25.noarch.rpm"
RPM_HASH = "a93148ef770482997023069bcb7dfe7b8e985bae09621894ea8399c2aa912cb818a59ff680cb2dfdf3bd9df46102de79f04cd8b9110567f8fdbf6c983ba22199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ikvm \
mono-ICSharpCode.SharpZipLib \
mono-IKVM.AWT.WinForms \
mono-IKVM.OpenJDK.Beans \
mono-IKVM.OpenJDK.Charsets \
mono-IKVM.OpenJDK.Cldrdata \
mono-IKVM.OpenJDK.Corba \
mono-IKVM.OpenJDK.Core \
mono-IKVM.OpenJDK.Jdbc \
mono-IKVM.OpenJDK.Localedata \
mono-IKVM.OpenJDK.Management \
mono-IKVM.OpenJDK.Media \
mono-IKVM.OpenJDK.Misc \
mono-IKVM.OpenJDK.Naming \
mono-IKVM.OpenJDK.Nashorn \
mono-IKVM.OpenJDK.Remoting \
mono-IKVM.OpenJDK.Security \
mono-IKVM.OpenJDK.SwingAWT \
mono-IKVM.OpenJDK.Text \
mono-IKVM.OpenJDK.Tools \
mono-IKVM.OpenJDK.Util \
mono-IKVM.OpenJDK.XML.API \
mono-IKVM.OpenJDK.XML.Bind \
mono-IKVM.OpenJDK.XML.Crypto \
mono-IKVM.OpenJDK.XML.Parse \
mono-IKVM.OpenJDK.XML.Transform \
mono-IKVM.OpenJDK.XML.WebServices \
mono-IKVM.OpenJDK.XML.XPath \
mono-IKVM.Reflection \
mono-IKVM.Runtime \
mono-IKVM.Runtime.JNI \
mono-ikvm \
mono-ikvmc \
mono-ikvmstub \
pkgconfig-ikvm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
mono-System \
mono-System.Configuration \
mono-System.Core \
mono-System.Data \
mono-System.Drawing \
mono-System.Security \
mono-System.Windows.Forms \
mono-System.Xml \
mono-ikvm \
mono-mscorlib"

inherit rpm
