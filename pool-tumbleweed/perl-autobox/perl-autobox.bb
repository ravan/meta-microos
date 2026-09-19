SUMMARY = "Call methods on native types"
DESCRIPTION = "The autobox pragma allows methods to be called on integers, floats, \
strings, arrays, hashes, and code references in exactly the same manner as \
blessed references. \
 \
Autoboxing is transparent: values are not blessed into their (user-defined) \
implementation class (unless the method elects to bestow such a blessing) - \
they simply use its methods as though they are. \
 \
The classes (packages) into which the native types are boxed are fully \
configurable. By default, a method invoked on a non-object value is assumed \
to be defined in a class whose name corresponds to the 'ref()' type of that \
value - or SCALAR if the value is a non-reference."
LICENSE = "Artistic-2.0"

PV = "3.0.2"

RPM_NAME = "perl-autobox-3.0.2-1.11.aarch64.rpm"
RPM_HASH = "850a27ab495e2724fe335619ab0258559262c2525e926cecccdc8d5249c8d48f752481a1e9832e72fee75aecce4320fc1a4debfada562487b0bf4eb9871cef8d"

RPROVIDES:${PN} += "perl-autobox \
perl-autobox--universal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Scope--Guard \
perl-version"

inherit rpm
