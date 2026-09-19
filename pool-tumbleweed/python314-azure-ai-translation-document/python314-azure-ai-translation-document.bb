SUMMARY = "Microsoft Azure Document Translation Client Library for Python"
DESCRIPTION = "Azure Cognitive Services Document Translation is a cloud service that translates documents \
to and from 90 languages and dialects while preserving document structure and data format. \
Use the client library for Document Translation to: \
 \
 * Translate numerous, large files from an Azure Blob Storage container to a target container \
   in your language of choice. \
 * Check the translation status and progress of each document in the translation operation. \
 * Apply a custom translation model or glossaries to tailor translation to your specific case."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-ai-translation-document-1.1.0-1.9.noarch.rpm"
RPM_HASH = "12dfb3a898e357df8d5f10b93c8c4e57c4fecb1e63d0f00ba2ee4efcbda046ed040bf6b163efc819f5e9d9b1858775f07e78dcd7c39bf833d550b6997b39cccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-translation-document \
python314-azure-ai-translation-document \
python3dist-azure-ai-translation-document"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-ai-nspkg \
python314-azure-ai-translation-nspkg \
python314-typing-extensions"

inherit rpm
