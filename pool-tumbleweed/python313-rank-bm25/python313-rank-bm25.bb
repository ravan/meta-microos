SUMMARY = "Various BM25 algorithms for document ranking"
DESCRIPTION = "Rank-BM25: A two line search engine \
A collection of algorithms for querying a set of documents and returning the ones most relevant to the query. The most common use case for these algorithms is, as you might have guessed, to create search engines."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python313-rank-bm25-0.2.2-1.8.noarch.rpm"
RPM_HASH = "c77b0c67f5781d71a3826da80b4b7f064d1ed74443418e5bf1ba30d36d6af1c289a96f3c0598354bcd2fe8004eaf40ea6293588fe4d830c81ac1e4c328954bf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rank-bm25 \
python3.13dist-rank-bm25 \
python313-rank-bm25 \
python3dist-rank-bm25"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
