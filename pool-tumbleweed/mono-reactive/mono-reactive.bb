SUMMARY = "Reactive Extensions"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
Microsoft's Reactive Extensions."
LICENSE = "Apache-2.0"

PV = "6.12.0"

RPM_NAME = "mono-reactive-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "d541a84754b58f1dd0c9baae7155bcf915544d90d20487ba1f6ec0eb8a42c12ac99a4af86432f5997f5130df96d6b3e631e4aa511da8112f92388e49175f9d05"

RPROVIDES:${PN} += "mono-System.Reactive.Core \
mono-System.Reactive.Debugger \
mono-System.Reactive.Experimental \
mono-System.Reactive.Interfaces \
mono-System.Reactive.Linq \
mono-System.Reactive.Observable.Aliases \
mono-System.Reactive.PlatformServices \
mono-System.Reactive.Providers \
mono-System.Reactive.Runtime.Remoting \
mono-System.Reactive.Windows.Forms \
mono-System.Reactive.Windows.Threading \
mono-reactive \
pkgconfig-reactive"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mono-System \
mono-System.Core \
mono-System.Windows.Forms \
mono-WindowsBase \
mono-core \
mono-mscorlib"

inherit rpm
