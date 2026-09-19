SUMMARY = "JSON framework for C#"
DESCRIPTION = "Newtonsoft.Json aka Json.NET is a JSON framework."
LICENSE = "MIT & BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "newtonsoft-json-7.0.1-4.6.noarch.rpm"
RPM_HASH = "bc505177b40cafdef918410b3cd484ea2a33862bb6cc8630b2a42f7570ad0007772154375cdde7b39ca6c72a91dbb8c0806ee1c1edf78f8a1c83fdf44e6e7ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-Newtonsoft.Json \
newtonsoft-json"

RDEPENDS:${PN} += "mono-System \
mono-System.Core \
mono-System.Data \
mono-System.Numerics \
mono-System.Runtime.Serialization \
mono-System.Xml \
mono-System.Xml.Linq \
mono-mscorlib"

inherit rpm
