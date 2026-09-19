SUMMARY = "Python dependency injection framework, inspired by Guice"
DESCRIPTION = "Dependency injection as a formal pattern is less useful in Python than \
in other languages, primarily due to its support for keyword \
arguments, the ease with which objects can be mocked, and its dynamic \
nature. \
 \
That said, a framework for assisting in this process can remove a lot \
of boiler-plate from larger applications. That's where Injector can \
help. It automatically and transitively provides keyword arguments \
with their values. As an added benefit, Injector encourages nicely \
compartmentalised code through the use of Module s. \
 \
While being inspired by Guice, it does not slavishly replicate its \
API. Providing a Pythonic API trumps faithfulness."
LICENSE = "BSD-3-Clause"

PV = "0.24.0"

RPM_NAME = "python313-injector-0.24.0-1.3.noarch.rpm"
RPM_HASH = "0f6b6699e87f7c75bd99a7ccc8d532b3dc43220d2cd9f2cdc4dc17bb4a54dde9e9cc44bde3b42c7dcdb0c0b6a3562af80a54d5e17cef13653df550306f112165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-injector \
python3.13dist-injector \
python313-injector \
python3dist-injector"

RDEPENDS:${PN} += "python-abi \
python313"

inherit rpm
