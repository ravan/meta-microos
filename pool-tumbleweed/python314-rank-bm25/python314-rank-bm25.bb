SUMMARY = "Various BM25 algorithms for document ranking"
DESCRIPTION = "Rank-BM25: A two line search engine \
A collection of algorithms for querying a set of documents and returning the ones most relevant to the query. The most common use case for these algorithms is, as you might have guessed, to create search engines."
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python314-rank-bm25-0.2.2-1.8.noarch.rpm"
RPM_HASH = "2efe2ef73637aa6c813829da8fe03bfec4172084866839989d20bf96fee037f331ceeb3880e46e8e8cd786fe151d3ea36470e0f72f02cf4256e6ad81553b5f75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rank-bm25 \
python314-rank-bm25 \
python3dist-rank-bm25"

RDEPENDS:${PN} += "python-abi \
python314-numpy"

inherit rpm
