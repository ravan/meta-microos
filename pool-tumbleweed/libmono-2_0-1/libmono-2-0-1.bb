SUMMARY = "A Library for embedding Mono in your Application"
DESCRIPTION = "The Mono Project is an open development initiative that is working to \
develop an open source, Unix version of the .NET development platform. \
Its objective is to enable Unix developers to build and deploy \
cross-platform .NET applications. The project will implement various \
technologies that have been submitted to the ECMA for standardization. \
 \
A Library for embedding Mono in your Application."
LICENSE = "LGPL-2.1-only"

PV = "6.12.0"

RPM_NAME = "libmono-2_0-1-6.12.0-8.11.aarch64.rpm"
RPM_HASH = "84d32608414114912e8dc20158b260f4602ae2bed0fd07a95fef88a3aaff1e49b6ee468934bebed69af4bb56b200fb8b00598ae9d9e072e0c79903a2e306ea37"

RPROVIDES:${PN} += "libmono-2-0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libmonosgen-2-0-1"

inherit rpm
