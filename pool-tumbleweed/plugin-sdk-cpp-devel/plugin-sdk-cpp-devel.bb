SUMMARY = "Development files for plugin-sdk-cpp"
DESCRIPTION = "Header files of the Falcosecurity Plugin SDK for C++ (header-only)."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "plugin-sdk-cpp-devel-0.4.1-1.1.noarch.rpm"
RPM_HASH = "ced730b8b3813b99071ddb17abbaf2fcd141d8ef79e3606f790f9d2c938e23fee66b66615b64e24c3564ce3420b9d491cbf2202a0806e13a664cdff48444b55c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plugin-sdk-cpp-devel"

RDEPENDS:${PN} += "libstdc++-devel"

inherit rpm
